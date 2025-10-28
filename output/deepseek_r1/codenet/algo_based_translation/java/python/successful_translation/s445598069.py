
import sys

def main():
    input = sys.stdin.read().split()
    n = int(input[0])
    s = [0] * 100010
    
    for num in input[1:n+1]:
        s[int(num)] += 1
    
    for i in range(len(s)):
        if s[i] != 0:
            s[i] = 2 if s[i] % 2 == 0 else 1
    
    one, two = 0, 0
    for val in s:
        if val == 1:
            one += 1
        elif val == 2:
            two += 1
    
    if two % 2 != 0:
        one -= 1
    
    print(two + one)

if __name__ == "__main__":
    main()

