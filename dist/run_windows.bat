@echo off
IF exist iTextOutput ( echo iTextOutput exists ) ELSE ( mkdir iTextOutput && echo iTextOutput created)
java -jar iTextDemo.jar