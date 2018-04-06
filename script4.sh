#!/bin/bash
echo -n "Enter a number: "
read number
a=2
while [ $a -lt $number ]
do
if [ $(($number % $a)) -eq 0 ] 
then 
echo "$number is not a prime number"
echo  "$number is divisible by $a "
exit
else
echo "$number is a prime number "
i=$(( $a + 1))
exit
fi
done
