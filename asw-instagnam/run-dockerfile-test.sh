#!/bin/bash 

echo Running docker-compose (MySQL 5.5, Consul, Ricette)

build gradle
docker-compose up -d
