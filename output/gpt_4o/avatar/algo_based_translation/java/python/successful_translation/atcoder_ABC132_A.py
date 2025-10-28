
def main():
    import sys
    input = sys.stdin.read
    
    # Read the input
    s = input().strip()
    
    # Convert the string to a list of characters
    targ = list(s)
    
    # Create a dictionary to count occurrences of each character
    map_ = {}
    
    # Iterate over each character in targ
    for char in targ:
        if char not in map_:
            map_[char] = 1
        else:
            map_[char] += 1
    
    # Check if the condition is met
    ok = True
    for count in map_.values():
        if count != 2:
            ok = False
            break
    
    # Print the result based on the conditions
    if ok and len(map_) == 2:
        print("Yes")
    else:
        print("No")

if __name__ == "__main__":
    main()

