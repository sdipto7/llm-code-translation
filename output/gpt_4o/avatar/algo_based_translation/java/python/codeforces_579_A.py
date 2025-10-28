
def main():
    import sys

    # Read integer input
    n = int(sys.stdin.readline().strip())
    
    # Initialize an empty string to store the binary representation
    s = ""
    
    # Convert the integer n to binary
    while n > 0:
        x = n % 2
        n //= 2
        s += str(x)
    
    # Count the number of '1's in the binary string s
    ans = 0
    for i in range(len(s)):
        if s[i] == '1':
            ans += 1
    
    # Output the result
    print(ans)

if __name__ == "__main__":
    main()

