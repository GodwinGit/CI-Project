#!/bin/bash
echo "Please enter file name you're looking for: "
read filename
if [[ -f $filename ]] 
then
echo " the filename exists " 
mv $filename $filename.sh
chmod 755 $filename.sh
else
 echo "This file does not exist"
fi
