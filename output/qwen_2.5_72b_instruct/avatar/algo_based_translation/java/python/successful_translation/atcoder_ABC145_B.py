
import sys

def cout(str):
    print(str)

def main():
    import sys
    from sys import stdin
    
    input = stdin.read().splitlines()
    n = int(input[0])
    str = input[1]
    
    a = ""
    for i in range(n // 2):
        a += str[i]
    
    if str == a + a:
        cout("Yes")
    else:
        cout("No")

if __name__ == "__main__":
    main()

