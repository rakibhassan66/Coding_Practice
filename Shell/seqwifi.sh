#!/bin/bash

echo "Scanning for available WiFi networks:"
echo "-------------------------------------"

# Use nmcli to list WiFi access points
wifi_list=$(nmcli -t -f SSID,SIGNAL dev wifi)

# Parse and display the list
while IFS=: read -r ssid signal; do
    echo "WiFi Network: $ssid"
    echo "Signal Strength: $signal"

    # Use iwlist to get detailed info about the network
    iwlist_output=$(iwlist wlan0 scan essid "$ssid" 2>/dev/null)
    
    # Check if network is encrypted
    if grep -q "Encryption key:on" <<< "$iwlist_output"; then
        echo "Security: Encrypted"
    else
        echo "Security: Open"
    fi

    # Check if WPA/WPA2 is supported
    if grep -q "WPA Version 1" <<< "$iwlist_output" || grep -q "WPA Version 2" <<< "$iwlist_output"; then
        echo "WPA/WPA2 Supported: Yes"
    else
        echo "WPA/WPA2 Supported: No"
    fi

    echo "-------------------------------------"
done <<< "$wifi_list"

