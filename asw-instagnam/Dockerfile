########################################################
# Dockerfile per l'applicazione lucky-word 
########################################################

FROM mysql

ENV MYSQL_DATABASE company

COPY ./sql-scripts/ /docker-entrypoint-initdb.d/

