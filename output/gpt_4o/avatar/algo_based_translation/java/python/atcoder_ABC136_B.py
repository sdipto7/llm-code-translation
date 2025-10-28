
import math

def main():
    N = int(input().strip())
    
    count = 0
    temp = N
    ans = 0
    
    # Determine the number of digits in N
    while temp > 0:
        temp //= 10
        count += 1
    
    # Calculate the answer based on the number of digits
    for i in range(1, count + 1):
        if i == count:
            if i % 2 == 1:
                ans += (N - 10**(i - 1) + 1)
        else:
            if i == 1:
                ans += 9
            elif i % 2 == 1:
                ans += (10**i - 10**(i - 1))
    
    print(ans)

if __name__ == "__main__":
    main()

