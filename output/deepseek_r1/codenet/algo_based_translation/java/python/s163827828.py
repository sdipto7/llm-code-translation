
import sys

def main():
    data = sys.stdin.read().split()
    ptr = 0
    N = int(data[ptr])
    ptr += 1
    strings = data[ptr:ptr+N]
    
    a_num = 0
    b_num = 0
    flag = True
    ans = 0
    
    for s in strings:
        if len(s) == 0:
            continue
        if s[0] == 'B':
            b_num += 1
        if s[-1] == 'A':
            a_num += 1
        has_b = s[0] == 'B'
        has_a = s[-1] == 'A'
        if has_b or has_a:
            if not (has_b and has_a):
                flag = False
        for j in range(len(s) - 1):
            if s[j:j+2] == 'AB':
                ans += 1
                
    ans += min(a_num, b_num)
    if min(a_num, b_num) != 0 and flag:
        ans -= 1
        
    print(ans)

if __name__ == "__main__":
    main()

