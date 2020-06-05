#!/bin/bash
if [ "$USER" != "root" ]; then
    echo "E' necessario essere l'utente root per eseguire questo script"
    exit 1
fi

gradle build &&
docker-compose up -d
