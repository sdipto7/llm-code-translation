
def main():
    import sys
    input = sys.stdin.read
    data = input().split()
    
    n = int(data[0])
    c = [0] * (n - 1)
    s = [0] * (n - 1)
    f = [0] * (n - 1)
    
    index = 1
    for i in range(n - 1):
        c[i] = int(data[index])
        s[i] = int(data[index + 1])
        f[i] = int(data[index + 2])
        index += 3
    
    for i in range(n - 1):
        time = s[i] + c[i]
        for j in range(i + 1, n - 1):
            if time % f[j] != 0:
                time += f[j] - (time % f[j])
            
            if time < s[j]:
                time = s[j]
            
            time += c[j]
        
        print(time)
    print(0)

main()

