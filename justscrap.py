from newspaper import Article
import os
article = Article("https://www.skynewsarabia.com/varieties/1451025-ثمنها-يناسب-الأثرياء-تعرف-أغلى-أطعمة-العالم", language="ar")
article.download()
article.parse()
texttemp =" "
if(article.text[0:3] == "كتب" or article.text[0:6] == "الكاتب" or article.text[0:5] == "كتابة"):
    texttemp = "\n".join(article.text.split("\n")[1:])
else:
    texttemp = article.text
#print(texttemp)
#print(article.title)
#print(article.top_image)
file2 = open('content.txt', 'w')
file2.write(texttemp)
file2.close()
