
def total(numbers):
    result = []

    for index in range(len(numbers)):
        sum = 0

        for count in range(len(numbers[index])):
            sum += numbers[index][count]

        result.append(sum)

    return result


def average(numbers):
    result = []

    for index in range(len(numbers)):
        sum = 0

        for count in range(len(numbers[index])):
            sum += numbers[index][count]

        result.append(sum / len(numbers[index]))

    return result


def position(numbers):
    result = []
    averages = average(numbers)

    for index in range(len(numbers)):
        rank = 1

        for count in range(len(numbers)):
            if averages[count] > averages[index]:
                rank += 1

        result.append(rank)

    return result


# Main program

print("How many students do you have?")
student = int(input())

print("How many subjects do they offer?")
subject = int(input())

print("Saving >>>>>>>>>>>>>>>>>>>")
print("Saved Successfully")
print()

scores = []

for index in range(student):
    student_scores = []

    for count in range(subject):
        print(f"Entering score for Student {index + 1}")
        score = int(input(f"Entering score for Subject {count + 1}: "))

        while score < 0 or score > 100:
            score = int(input("Invalid score. Try again: "))

        student_scores.append(score)

        print("Saving >>>>>>>>>>>>>>>>>>>")
        print("Saved Successfully")
        print()

    scores.append(student_scores)


totals = total(scores)
averages = average(scores)
positions = position(scores)


print("==============================================================")
print("STUDENT\t", end="")

for count in range(subject):
    print(f"SUB{count + 1}\t", end="")

print("TOT\tAVE\tPOS")

print("==============================================================")


for index in range(len(scores)):

    print(f"Student {index + 1}\t", end="")

    for count in range(len(scores[index])):
        print(f"{scores[index][count]}\t", end="")

    print(f"{totals[index]}\t", end="")
    print(f"{averages[index]:.2f}\t", end="")
    print(positions[index])


print("==============================================================")

