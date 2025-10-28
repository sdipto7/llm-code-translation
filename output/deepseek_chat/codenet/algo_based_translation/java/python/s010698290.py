
import sys

def main():
    data = sys.stdin.read().split()
    if not data:
        return
    
    n = int(data[0])
    m = int(data[1])
    index = 2
    
    penal = [0] * (n + 1)
    solved = [False] * (n + 1)
    
    for _ in range(m):
        num = int(data[index])
        index += 1
        str_val = data[index]
        index += 1
        
        if str_val[0] == 'A':
            solved[num] = True
        elif not solved[num]:
            penal[num] += 1
    
    correct_ans = 0
    num_penal = 0
    
    for i in range(1, n + 1):
        if solved[i]:
            correct_ans += 1
            num_penal += penal[i]
    
    print(f"{correct_ans} {num_penal}")

if __name__ == "__main__":
    main()

