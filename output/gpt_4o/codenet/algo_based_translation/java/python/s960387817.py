
def main():
    import sys
    input = sys.stdin.read
    data = input().split()
    
    n = int(data[0])
    set_of_integers = set()
    
    for i in range(1, n + 1):
        set_of_integers.add(int(data[i]))
    
    print(len(set_of_integers))

if __name__ == "__main__":
    main()

