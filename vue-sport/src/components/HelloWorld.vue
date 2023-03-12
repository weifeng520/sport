<script setup lang="ts">
import { ref } from 'vue'
import testApi from '@/api/test'

defineProps<{ msg: string }>()

const info = ref<any>()
const test = async () => {
  await testApi.test().then(res => {
    console.log(res)
    info.value = res
  })
}
</script>

<template>
  <h1>{{ msg }}</h1>
  <h2>{{ info }}</h2>
  <el-button type="primary" @click="test">Primary</el-button>
</template>

<style scoped>
.read-the-docs {
  color: #888;
}
</style>
