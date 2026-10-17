#include <iostream>
using namespace std;

int main(){

    int arr[] = {1, 2, 4, 6, 8, 9};
    int target = 15;
    int left = 0;
    int right = 5;

    for (int i =0; left<right; i++){
        
        if(arr[left] + arr[right] > target){
            right++;
        }

        else if(arr[left] + arr[right] < target){
            left++;
        }

        else if(arr[left] + arr[right] == target){
            cout<<"index "<<right <<" and "<< left<< endl;
            break;
            
        }

        else{
            cout<<"target doesnt exist";
        }
    }
}