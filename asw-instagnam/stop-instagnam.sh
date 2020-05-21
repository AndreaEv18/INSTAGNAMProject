#!/bin/bash
docker-compose down && docker system prune -a
rm -r api-gateway/build
rm -r ricette/build
rm -r ricette-seguite/build
rm -r connessioni/build

