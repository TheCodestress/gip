/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   main.cpp
 * Author: Ryan
 *
 * Created on July 10, 2016, 12:27 AM
 */

#include <iostream>

using namespace std;

int div3or5(int number){
    int total = 0;
    for(int i = 0; i < number; i++){
        if ((i%3 == 0) || (i%5 == 0)){
            total = total + i;
        }
    }
    return total;
}

int main(int argc, char** argv) {
    int value = 1000;
    int sum;
    sum = div3or5(value);
    cout << "The total is " << sum << endl;
    return 0;
}

