#!/bin/bash
# It's only for education purposes; do not use for misuse
# Your_Deadbrat

for url in $(cat urls.txt)
do
    echo "Checking $url IP address..."
    hostname=$(echo "$url" | sed -e 's/https:\/\/\([^/]*\).*/\1/')
    result=$(ping -c 2 $hostname | grep "64 bytes from")
    if [ -n "$result" ]; then
        ip=$(echo $result | awk '{print $4}' | cut -d ":" -f 1)
        echo "$url IP address is: $ip"
    else
        echo "Unable to resolve $url."
    fi
done

