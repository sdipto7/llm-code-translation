
def main():
    import sys
    input = sys.stdin.read
    data = input().strip().split()
    
    N = int(data[0])
    words = data[1:]
    
    ans = True
    past = set()
    next_char = ''
    
    for i in range(N):
        current_word = words[i]
        if current_word in past:
            ans = False
            break
        past.add(current_word)
        if i != 0:
            if next_char != current_word[0]:
                ans = False
                break
        next_char = current_word[-1]
    
    if ans:
        print("Yes")
    else:
        print("No")

if __name__ == "__main__":
    main()

