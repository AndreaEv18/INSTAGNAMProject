#!/bin/bash
docker-compose down &&
docker image rm asw-instagnam_ricette
docker image rm asw-instagnam_ricette-seguite
docker image rm asw-instagnam_api-gateway
docker image rm asw-instagnam_connessioni
rm -r api-gateway/build
rm -r ricette/build
rm -r ricette-seguite/build
rm -r connessioni/build

