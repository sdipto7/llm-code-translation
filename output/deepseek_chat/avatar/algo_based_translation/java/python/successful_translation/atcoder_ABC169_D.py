
def main():
    n = int(input())
    sqrt_n = int(n ** 0.5)
    answer = 0
    
    i = 2
    while i <= sqrt_n:
        count = 0
        while n % i == 0:
            n = n // i
            count += 1
        
        j = 1
        while count - j >= 0:
            count -= j
            answer += 1
            j += 1
        
        i += 1
    
    if n > 1:
        answer += 1
    
    print(answer)

if __name__ == "__main__":
    main()

