from textblob import TextBlob
file = open("data_en.txt")
text = file.read().replace("\n", " ")
file.close()
blob = TextBlob(text)
out = blob.translate(to='ar')
str_out = str(out)

file2 = open("data_ar.txt" , "w")
file2.write(str_out)
file2.close()


    
