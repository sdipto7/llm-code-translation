
import sys

def main():
    str_arr = [""] * 4
    i = -1
    while i != 3:
        i += 1
        str_arr[i] = input().strip()
    
    u = -1
    yes = 0
    
    while u != 2:
        u += 1
        i = -1
        while i != 2:
            i += 1
            if ((str_arr[u][i] == str_arr[u][i+1] and 
                 (str_arr[u+1][i] == str_arr[u][i] or 
                  str_arr[u+1][i+1] == str_arr[u][i])) or 
                (str_arr[u+1][i] == str_arr[u+1][i+1] and 
                 (str_arr[u][i] == str_arr[u+1][i] or 
                  str_arr[u][i+1] == str_arr[u+1][i]))):
                yes = 1
                print("YES")
                break
        if yes == 1:
            break
    
    if yes == 0:
        print("NO")

if __name__ == "__main__":
    main()

