
def main():
    import sys
    
    # Read the input line
    line = sys.stdin.readline().strip()
    
    # Process the input data
    list = line.split(" ")
    
    # Convert input data to integers
    x = int(list[0])
    a = int(list[1])
    y = int(list[2])
    
    # Initialize output variable
    h = "NO"
    
    # Evaluate conditions
    if x == 5 or x == 7 or a == 5 or a == 7 or y == 5 or y == 7:
        if x + a + y == 17:
            h = "YES"
    
    # Output the result
    print(h)

if __name__ == "__main__":
    main()

