n = int(input())
array = []
for i in range(n):
    array.append(input())

count = 0

for word in array:
    words = []
    for i in range(len(word)):
        words.append(word[i:i+1])
    for j in range(len(words) - 2):
        if words[j] != words[j + 1]:
            if words[j] in words[j + 2:]:
                count += 1
                break
    
print(n - count)
