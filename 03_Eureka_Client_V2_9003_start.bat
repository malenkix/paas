@ECHO off
title Eureka Client V2 Port 9003
cd %CD%/02_Eureka_Client
SET server.port=9003
SET app.version=v2
cmd /k mvn install spring-boot:run