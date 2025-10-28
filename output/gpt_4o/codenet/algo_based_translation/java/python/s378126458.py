
def main():
    import sys
    input = sys.stdin.read
    data = input().split()
    
    # Input reading
    N = int(data[0])  # number of characters in the string
    Q = int(data[1])  # number of queries
    s = data[2]       # input string
    
    # Variable declaration
    pre = [0] * (N + 1)  # prefix sum array of size N+1

    # Building the prefix sum array
    for i in range(1, N):
        if s[i - 1] == 'A' and s[i] == 'C':
            pre[i] = 1  # Initialize prefix sum array where 'AC' is found

    # Calculate prefix sums
    for i in range(1, N):
        pre[i] += pre[i - 1]  # Accumulate prefix sums

    # Processing queries
    index = 3
    results = []
    for _ in range(Q):
        l = int(data[index])    # left index of query (1-based)
        r = int(data[index + 1])  # right index of query (1-based)
        r -= 1  # Adjust right index to 0-based
        index += 2

        # Output result of each query
        results.append(pre[r] - pre[l - 1])  # Calculate and print number of 'AC' in range [l, r]

    for result in results:
        print(result)

if __name__ == "__main__":
    main()

