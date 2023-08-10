#!/bin/bash
banner(){
    echo "Hello User"
}

dig(){
    echo "Insert 1 to see your ip address"
    echo "Insert 2 to see your mac address"
    echo "Insert 0 to exit from this loop"
}

main(){
    read -p "Select your option : " odd

    if [ $odd == 1 ]; then
        echo "Your IP Address is :" $(hostname -I)
    elif [ $odd == 2 ]; then
        echo "Your MAC Address is :" $(ip link show eth0 | grep link/ether | awk '{print $2}')
    elif [ $odd == 0 ]; then
        exit
    fi
}

while true; do
    banner
    dig
    main
done
#!/bin/bash
banner(){
echo "Hello User"
}
dig(){
echo "Insert 1 to see your ip address"
echo "Insert 1 to see your mac address"
echo "Insert 0  to exit from this loop"
}
main(){
read -p "Select your option :" odd

if [ $odd == 1 ];
then
           echo "Your IP Address is :" $($hostname -I)
elif [ $odd == 2  ];
then
           echo "Your MAC Address is :" $(ip link show eth0 | grep link/ether | awk'{print $2}')

elif [ $odd == 0  ];
then 
            exit


for ((; ;))
do
banner
dig
main
done
