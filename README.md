# poccicd

Develop CI/CD platform for play framework 1.x applications.
Using microk8s.

En .bashrc
```
alias kubectl='microk8s kubectl'
```



## Crear imagen y publicar en registry interno de microk8s
`
docker build -t localhost:32000/poccicd .
docker push localhost:32000/poccicd

`
## desplegar con k8s

`
kubectl apply -f poccicd.yaml 
`



