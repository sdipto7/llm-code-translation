
def main():
    import sys
    
    # Read integer inputs using standard input
    input_data = sys.stdin.read().strip().split()
    T = int(input_data[0])
    S = int(input_data[1])
    q = int(input_data[2])
    
    # Initialize variables for algorithm
    previous = S
    answer = 0
    
    # Loop until condition is met
    while previous < T:
        answer += 1
        previous *= q
    
    # Output result
    print(answer)

if __name__ == "__main__":
    main()

