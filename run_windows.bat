@echo off
IF exist iTextOutput ( echo iTextOutput exists ) ELSE ( mkdir iTextOutput && echo iTextOutput created)
java -jar itestdemo.jar
cd iTextOutput
start demo1.pdf
