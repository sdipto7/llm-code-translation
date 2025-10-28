
def main():
    import sys
    input = sys.stdin.read
    n = input().strip()
    
    s = False
    
    result = []
    for char in n:
        if char == '.':
            if s:
                result.append('1')
                s = False
            else:
                result.append('0')
        else:  # char == '-'
            if s:
                result.append('2')
                s = False
            else:
                s = True
    
    print(''.join(result))

if __name__ == "__main__":
    main()

