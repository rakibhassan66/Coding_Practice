#!/bin/bash

main(){
  if [ "$(id -u)" != 0 ]; then
    echo "Sorry, you can't access the script unless you're a root user."
    exit 1
  fi

  # Your script logic goes here

}

main "$@"

