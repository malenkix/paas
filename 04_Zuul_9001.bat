@ECHO off
title Zuul Port 9001
cd %CD%/04_Zuul
cmd /k mvn install spring-boot:run