@ECHO off
title Eureka Client V1 Port 9002
cd %CD%/02_Eureka_Client
SET server.port=9002
SET app.version=v1
cmd /k mvn install spring-boot:run