
import sys

def main():
    data = sys.stdin.read().split()
    if not data:
        return
    
    N = int(data[0])
    words = data[1:1+N]
    
    map_dict = {}
    for i in range(N):
        map_dict[i] = words[i]
    
    ans = True
    past = {}
    next_char = ""
    
    for i in range(N):
        current_word = map_dict[i]
        
        if current_word in past.values():
            ans = False
            break
            
        past[i] = current_word
        
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

