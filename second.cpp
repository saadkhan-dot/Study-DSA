#include <iostream>
using namespace std;

int main(){

    int arr[] = {4, 9, 2, 15, 6, 11};
    int maxnum = arr[0];

    for (int i =0; i<6; i++){
        if (arr[i] > maxnum){
            maxnum = arr[i];
        }
        
    }
    cout<< maxnum;
}