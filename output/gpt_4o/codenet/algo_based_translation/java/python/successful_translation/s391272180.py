
def rotate(str_builder):
    len_str = len(str_builder)
    t = str_builder[0]
    for i in range(len_str - 1):
        str_builder[i] = str_builder[i + 1]
    str_builder[len_str - 1] = t
    return str_builder

def main():
    import sys
    input = sys.stdin.read
    data = input().split()
    
    s = list(data[0])
    t = list(data[1])
    flag = False

    for _ in range(len(s)):
        s = rotate(s)
        if ''.join(t) == ''.join(s):
            flag = True
            break
    
    if flag:
        print("Yes")
    else:
        print("No")

if __name__ == '__main__':
    main()

