#!/bin/bash
test $(curl calculator-service:30488/div?a=6\\&b=2) -eq 3 && echo 'pass' || 'fail'
