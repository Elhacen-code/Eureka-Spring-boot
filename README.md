# Eureka-Spring-boot
Implementation eurika with spring-boot 3

# L'utilisation de l'URL codée est-il utile ?
1 - Mises à jour du code des modifications nécessaire : Si une adresse de microservice a changé, elle doit être mise à jour dans tous les autres microservices qui sont en contact avec elle.
2 - URL dynamique dans le cloud : Lorsque nous déployons sur le cloud, nous obtenons des URL dynamiques, et elles changent si nous arrêtons et redémarrons le serveur ou si nous les déployons ailleurs. Nous devons nous adapter au changement, nous ne pouvons pas prédire les changements d'URL.
3 - Équilibrage de charge : Si nous lançons plusieurs instances, chaque instance peut avoir des URL différentes et il est également très inefficace de coder en dur les URL des instances.
4 - Environnements multiples : Les URL changent à chaque phase du processus d'ingénierie logicielle, c'est-à-dire qu'elles peuvent être différentes pendant le développement, les tests d'assurance qualité et la production. Nous ne pouvons pas modifier les URL codées en dur à chaque fois.

# Nous avons donc besoin d'un système qui découvre à tout moment l'URL mise à jour et actuelle du service. Ce processus s'appelle Service Discovery, et Eureka de Netflix est un outil utilisé pour cette découverte de service qu'ils ont open source..
