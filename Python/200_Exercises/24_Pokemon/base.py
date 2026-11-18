import requests
choice = input("Which Pokemon would you like to learn about? ")
a = requests.get("https://pokeapi.co/api/v2/pokemon/" + choice)
pokemon = requests.get(a).json()

# Use this JSON formatter to better visualize the JSON from the Pokemon website
# https://jsonformatter.org/json-viewer


print(pokemon["types"][0]["type"]["name"])
print(pokemon["abilities"][0]["ability"]["name"])