#!/bin/bash
test $(curl calculator-service:8080/div?a=6\\&b=2) -eq 3 && echo 'pass' || 'fail'
