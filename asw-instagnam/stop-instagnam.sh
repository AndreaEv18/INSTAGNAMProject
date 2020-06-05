#!/bin/bash
if [ "$USER" != "root" ]; then
    echo "E' necessario essere l'utente root per eseguire questo script"
    exit 1
fi

docker-compose down &&
docker image rm asw-instagnam_ricette
docker image rm asw-instagnam_ricette-seguite
docker image rm asw-instagnam_api-gateway
docker image rm asw-instagnam_connessioni
rm -r api-gateway/build
rm -r ricette/build
rm -r ricette-seguite/build
rm -r connessioni/build

