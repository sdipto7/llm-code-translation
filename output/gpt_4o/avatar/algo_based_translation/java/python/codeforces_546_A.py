
def main():
    import sys
    
    # Read inputs
    pandu = int(sys.stdin.readline().strip())
    vundu = int(sys.stdin.readline().strip())
    urdu = int(sys.stdin.readline().strip())
    
    c = 0
    
    # Calculate total cost
    for i in range(1, urdu + 1):
        c += i * pandu
    
    # Output result
    if c < vundu:
        print("0")
    else:
        print(c - vundu)

if __name__ == "__main__":
    main()

