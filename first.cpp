#include <iostream>
using namespace std;

int main(){

    int arr[] = {3,8,2,8,5,8,1};
    int count = 0;
    int val = 8;

    for (int i=0; i<7; i++){
        if(arr[i]==val){
            count++;
        }
        if(count == 2){
            return i;
        }
    }

}
