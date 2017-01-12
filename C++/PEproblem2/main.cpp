/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   main.cpp
 * Author: Ryan
 *
 * Created on July 11, 2016, 3:33 PM
 */

#include <cstdlib>
#include <iostream>

using namespace std;

/*
 * 
 */

int fibonacciSum(int limit){
    int sum = 0;
    int f1 = 0;
    int f2 = 1;
    int fNext = 0;
    while (fNext < limit){
        if (fNext%2 == 0){
            sum = sum + fNext;
        }
        fNext = f2 + f1;
        f1 = f2;
        f2 = fNext;
    }
    return sum;
}

int main(int argc, char** argv) {
    int sum;
    int limit = 4000000;
    sum = fibonacciSum(limit);
    cout << "The sum equals: " << sum << endl;
    fibonacciSum(limit);
    return 0;
}

