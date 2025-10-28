
import re

def main():
    import sys
    input = sys.stdin.read
    data = input().strip().split('\n')
    
    # Read and process the input words
    word1 = re.sub(r'[^a-zA-Z]', '', data[0]).lower()
    word2 = re.sub(r'[^a-zA-Z]', '', data[1]).lower()
    word3 = re.sub(r'[^a-zA-Z]', '', data[2]).lower()
    
    # Create permutations
    perm1 = word1 + word2 + word3
    perm2 = word1 + word3 + word2
    perm3 = word2 + word1 + word3
    perm4 = word2 + word3 + word1
    perm5 = word3 + word2 + word1
    perm6 = word3 + word1 + word2

    # Read the number of students
    students = int(data[3])
    
    # Process each test case
    results = []
    for i in range(students):
        testCase = re.sub(r'[^a-zA-Z]', '', data[4 + i]).lower()
        if (testCase == perm1 or testCase == perm2 or 
            testCase == perm3 or testCase == perm4 or 
            testCase == perm5 or testCase == perm6):
            results.append("ACC")
        else:
            results.append("WA")
    
    # Output results
    for result in results:
        print(result)

if __name__ == "__main__":
    main()

