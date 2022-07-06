from textblob import TextBlob
file = open("content.txt")
text = file.read().replace("\n", " ")
file.close()
blob = TextBlob(text)
out = blob.translate(to='en')
str_out = str(out)
    
file2 = open("data_en.txt" , "w")
file2.write(str_out)
file2.close()
