#!/bin/bash
ls -1 $1 > contentsOfCurrentDir
sudo cp contentsOfCurrentDir /etc/
