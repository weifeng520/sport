import request from '@/utils/request'


const test = () => {
    return request.get('/test')
}

export default {
    test
}