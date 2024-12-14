// Online C++ compiler to run C++ program online
#include <bits/stdc++.h>
using namespace std ;

int countDuplicate(vector<int> &arr ,int &n, int &target){
    int count = 0;
    for(int i = 0 ; i<arr.size() ; i++ ){
        if(target==arr[i])
               count++ ;
    }
    return count ;
}

int main() {
    // Write C++ code here
    int n ;
    cout<<" enter the size of array :";
    cin>>n;
    vector<int> arr(n);
    
    int target ;
    cout<<"enter target :";
    cin>>target ;
    
    for(int i =0 ; i<n ; i++)
         cin>>arr[i];
   
    int result = countDuplicate(arr,n,target);
    cout<<result;
        
    return 0;
}
